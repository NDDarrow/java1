/**
 * 
 */
 
 
 $(function(){
	$("#keyword").on("keyup",function(){
		if( e.keyCode==13){
			$("#serachFm").submit();
		}
	});
	$(".search_box i").on("click",function(){
		$("#searchFm").submit();
	});
});