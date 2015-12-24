<#ftl encoding='UTF-8'>

<script>
$(document).ready(function(){
	$("input").keyup(function(){
		var txt = $("input").val();
		$.post(
			"post-param", 
			{name: encodeURIComponent(txt)},
			function(result){
				$("#post-result").html("email suggestion:" + decodeURIComponent(result)+ "<br>");
		});
	});
});
</script>
<h3> when type name, ajax get text and send HTTP POST request , and return suggestion email</h3>

name <input type="text"></input> <br>
<p id="post-result" style="background-color:yellow;"> </p>
