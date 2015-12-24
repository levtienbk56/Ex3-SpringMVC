<#ftl encoding='UTF-8'>

<script>
function validateForm() {
    var str = document.forms["myForm"]["email"].value;
    var patt = new RegExp(/^[-a-z0-9~!$%^&*_=+}{\'?]+(\.[-a-z0-9~!$%^&*_=+}{\'?]+)*@([a-z0-9_][-a-z0-9_]*(\.[-a-z0-9_]+)*\.(aero|arpa|biz|com|coop|edu|gov|info|int|mil|museum|name|net|org|pro|travel|mobi|[a-z][a-z])|([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}))(:[0-9]{1,5})?$/i);
    var res = patt.test(str);
    
    if(!res){
    	alert("input must be a email address!");
    	return false;
    }
    return true;    
}
</script>

<h3>this example tests about email validation. </h3>
<pre>
it's using Regular Expression.
the format of email validation geting from <a href="http://emailregex.com/">link</a> 
Regex: <p style="color:red">/^[-a-z0-9~!$%^&*_=+}{\'?]+(\.[-a-z0-9~!$%^&*_=+}{\'?]+)*@([a-z0-9_][-a-z0-9_]*(\.[-a-z0-9_]+)*\.(aero|arpa|biz|com|coop|edu|gov|info|int|mil|museum|name|net|org|pro|travel|mobi|[a-z][a-z])|([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}))(:[0-9]{1,5})?$/i </font>
</pre>

<form id="myForm" action="js-validate"
onsubmit="return validateForm()" method="post">
Email: <input type="text" name="email">
<input type="submit" value="Submit">
</form>

<pre>
Status:  ${status}  
Email: ${email}
</pre>