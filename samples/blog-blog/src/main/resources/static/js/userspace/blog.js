/*!
 * blog.html 页面脚本.
 * 
 * @since: 1.0.0 2017-03-26
 * @author Way Lau <https://waylau.com>
 */
"use strict";
//# sourceURL=blog.js

// DOM 加载完再执行
$(function() {
	$.catalog("#catalog", ".post-content");
	
	// 处理删除博客事件
	$(".blog-content-container").on("click",".blog-delete-blog", function () { 
	    // 获取 CSRF Token 
	    var csrfToken = $("meta[name='_csrf']").attr("content");
	    var csrfHeader = $("meta[name='_csrf_header']").attr("content");


	    $.ajax({ 
	         url: blogUrl, 
	         type: 'DELETE', 
	         beforeSend: function(request) {
	             request.setRequestHeader(csrfHeader, csrfToken); // 添加  CSRF Token 
	         },
	         success: function(data){
	             if (data.success) {
	                 // 成功后，重定向
	                 window.location = data.body;
	             } else {
	                 toastr.error(data.message);
	             }
	         },
	         error : function() {
	             toastr.error("error!");
	         }
	     });
	});
});