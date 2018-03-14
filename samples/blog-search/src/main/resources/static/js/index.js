/*!
 * index main JS.
 * 
 * @since: 1.0.0 2017/4/12
 * @author Way Lau <https://waylau.com>
 */
"use strict";
//# sourceURL=index.js

// DOM 加载完再执行
$(function() {
    
	var _pageSize; // 存储用于搜索
	
	// 根据用户名、页面索引、页面大小获取用户列表
	function getBlogsByName(pageIndex, pageSize) {
		 $.ajax({ 
			 url: "/blogs", 
			 contentType : 'application/json',
			 data:{
				 "async":true, 
				 "pageIndex":pageIndex,
				 "pageSize":pageSize,
				 "keyword":$("#indexkeyword").val()
			 },
			 success: function(data){
				 $("#mainContainer").html(data);
				 
				 var keyword = $("#indexkeyword").val();
				 
				 // 如果是分类查询，则取消最新、最热选中样式
				 if (keyword.length > 0) {
					$(".nav-item .nav-link").removeClass("active");
				 }
		     },
		     error : function() {
		    	 toastr.error("error!");
		     }
		 });
	}
	
	// 分页
	$.tbpage("#mainContainer", function (pageIndex, pageSize) {
		getBlogsByName(pageIndex, pageSize);
		_pageSize = pageSize;
	});
   
	// 关键字搜索
	$("#indexsearch").click(function() {
		getBlogsByName(0, _pageSize);
	});
	
	// 最新\最热切换事件
	$(".nav-item .nav-link").click(function() {
 
		var url = $(this).attr("url");
		
		// 先移除其他的点击样式，再添加当前的点击样式
		$(".nav-item .nav-link").removeClass("active");
		$(this).addClass("active");  
 
		// 加载其他模块的页面到右侧工作区
		 $.ajax({ 
			 url: url+'&async=true', 
			 success: function(data){
				 $("#mainContainer").html(data);
			 },
			 error : function() {
				 toastr.error("error!");
			 }
		 })
		 
		 // 清空搜索框内容
		 $("#indexkeyword").val('');
	});
 
 
});