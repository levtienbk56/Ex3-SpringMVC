<#ftl encoding='UTF-8'>

<script>
function sum(){
	var a=document.getElementById("aVariable").value;
	var b=document.getElementById("bVariable").value;
	var c = Number(a) + Number(b);
	if(c.toString() == "NaN"){
		document.getElementById("resultSum").innerHTML = "";
		window.alert("input error. Pls enter 2 number");
		return false;
	}
	document.getElementById("resultSum").innerHTML = c;
	return true;
}
</script>

a: <input type="text" name="a" id="aVariable"> <br>
b: <input type="text" name="b" id="bVariable"> <br>
<input type="button" name="btsum" value="SUM" onclick="sum()"> <br>
<p style="float:left;"> a+b =  </p>
<p id="resultSum"> </p>