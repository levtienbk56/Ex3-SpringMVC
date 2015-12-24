<style>
#animate1 {
    background-color:red;
    width: 50px;
    height: 50px;
    border-radius: 25px; 
    text-align:center;
    vertical-align: middle;
}
#animate2{
	margin-top:20px;
    background-color:green;
    width: 100px;
    height: 50px;
}
</style>

<script>
$(document).ready(function(){
	$("#animate1").click(function(){
	      var div1 = $("#animate1");
	      var div2 = $("#animate2");
	      div1.animate({width:'200px', height:'200px', borderRadius:'100px'}, 'slow', function(){
	           div2.animate({opacity: '0.1'}, 'slow');
	      });
	});
});

</script>

<h3> when click the the circle below, width&height will change slowly </h3>
<h3> then, callback function will affected, green shape hide slowly</h3>
<div id="animate1" >click me!</div>
<div id="animate2">...</div>
