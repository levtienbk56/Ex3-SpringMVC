<script>
$(document).ready(function(){
	$("button").click(function(){
		$.getJSON("result.json", function(result){
			$("#json-result").html("id: " + result.id+ "<br>");
			$("#json-result").append("email: " + result.email + "<br>");
			$("#json-result").append("password: " + result.password + "<br>");
		});
	});
});
</script>
<h3> click button, using HTTP GET request to request json result from <a href="result.json">result.json</a></h3>
<div id="json-result" style="background-color:yellow;"> content updated here </div>
<button>Get External Content </button>