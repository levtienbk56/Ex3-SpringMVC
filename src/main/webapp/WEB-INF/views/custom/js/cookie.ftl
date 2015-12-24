<#ftl encoding='UTF-8'>

<style>
input{
 	margin:5px;
}
button{
	margin:5px;
	width:174px;
}
</style>
<script>
function createCookie(){
	var cname  = document.getElementById("input-cookie1").value;
	var cvalue = document.getElementById("input-cookie2").value;
	var exdays = document.getElementById("input-cookie3").value;
	
	if(cname==null || cname=="" || cvalue==null||cvalue==""||exdays==null||exdays=="" ||Number(exdays).toString()=="NaN" ||cname.indexOf("=")!=-1 || cvalue.indexOf("=")!=-1)
	{
		window.alert("input error!");
	}else{
		setCookie(cname, cvalue, exdays);
	}	
}
function setCookie(cname, cvalue, exdays){
	var d = new Date();
	d.setTime(d.getTime() + exdays*24*60*60*1000);
	var expires = "expires=" + d.toUTCString();
	document.cookie = cname + "="  + cvalue + ";" + expires;
}
function showCookies(){
	var cookies = document.cookie.split(";");
	var str = "";
	for(var i=0; i<cookies.length; i++){
		c = cookies[i];
		if(c != null || c != ""){
			str += "<li>" + c + "</li>";
		}
	} 
	var ul = document.getElementById("list-cookies").innerHTML = str;
}
function deleteAllCookies() {
    var cookies = document.cookie.split(";");

    for (var i = 0; i < cookies.length; i++) {
    	var cookie = cookies[i];
    	var eqPos = cookie.indexOf("=");
    	var name = eqPos > -1 ? cookie.substr(0, eqPos) : cookie;
    	document.cookie = name + "=;expires=Thu, 01 Jan 1970 00:00:00 GMT";
    }
}
function deleteCookie(){


}

</script>
<div class="row">
	<div class="col-md-4">		
		<input type="text" id="input-cookie1" placeholder="cookie name"><br>
		<input type="text" id="input-cookie2" placeholder="cookie value"><br>
		<input type="text" id="input-cookie3" placeholder="number dates expired"> <br>
		<button id="bt-create-cookie" onclick="createCookie()">create cookie</button> <br>
		<button id="bt-delete-cookie" onclick="deleteAllCookies()">delete all cookie</button> <br>
	</div>
	<div class="col-md-4">
		<button id="bt-show-cookie" onclick="showCookies()">show all cookie</button> <br>
		<pre>
			<ul id="list-cookies"> </ul>
		</pre>
	</div>
</div>