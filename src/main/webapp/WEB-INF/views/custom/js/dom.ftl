<#ftl encoding='UTF-8'>

<script>
 function write1(){
 	var str = document.getElementById("input1").value;
 	document.getElementById("container1").innerHTML = str;
 }
 function red(){
 	var x = document.getElementById("text2");
 	x.style.color = "red";
 }
function blue(){
 	var x = document.getElementById("text2");
 	x.style.color = "blue";
 }
 function cat(){
 	document.getElementById("image3").src="resources/img/cat.png";
 }
 function dog(){
 	document.getElementById("image3").src="resources/img/dog.jpg";
 }
 
 //javascript Animation
 var intervalId = null;
 function startAnimate() {
	pos=0;
	arrow = 1;
	elem = document.getElementById("animate");   
	if(intervalId == null){
 		intervalId = setInterval(frame, 5);
 	}
	function frame() {
	    if (pos >450) {
	       arrow = -1;
	    }else if(pos <0){
	    	arrow = 1;
	    }
	
	    pos+= arrow*1;
	    elem.style.left = pos + 'px';
	}
}

function stopAnimate(){
	clearInterval(intervalId);
	intervalId = null;
}

</script>


<div style="margin-bottom:20px;">
<fieldset>
    <legend> HTML DOM Content</legend>
    <p> write content of inputField</p>
    <input type="text" id="input1">
    <input type="button" onclick="write1()" value="Submit">
    <pre id="container1"></pre>
</fieldset>
</div>

<div style="margin-bottom:20px;">
<fieldset>
    <legend> HTML DOM Css</legend>
    <p id="text2"> change color of a html element (ex: p element)</p>
    <input type="button" onclick="red()" value="Red">
    <input type="button" onclick="blue()" value="Blue">
</fieldset>
</div>

<div style="margin-bottom:20px;">
<fieldset>
    <legend> HTML DOM attribute</legend>
    <p id="text2"> change attribute of a html element (ex: attribute "src", element "img")</p>
    <img id="image3" width="120px" height="160px" src="resources/img/dog.jpg"> <br>
    <button onclick="cat()">show Cat</button>
    <button onclick="dog()">show Dog</button>
</fieldset>
</div>


<div style="margin-bottom:20px;">
<fieldset>
    <legend> HTML DOM animation</legend>
    <p> create an animate object using a "div" tag, and using method setInterval() to create animations </p> 
    <p>
	<button onclick="startAnimate()">start</button>
	<button onclick="stopAnimate()">stop</button>
	</p>
	<div id="container"style="width:500px;height:50px;position:relative;background:yellow;">
	<div id="animate" style="width:50px;height:50px;position:absolute;background-color:blue;"></div></div>
</fieldset>
</div>