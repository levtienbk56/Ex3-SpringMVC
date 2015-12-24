<#ftl encoding='UTF-8'>
</style>
<div class="row">
	<div class="col-md-5">
	<form action="login" method="post" id="loginform" class="form-signin">
		<fieldset>
	    <input type="text" name="email" class="form-control email-title" placeholder="E-mail">
	    <input type="password" name="password" class="form-control" placeholder="Password">
	    <br>
	    <input type="submit" value="Login" class="btn btn-lg btn-success btn-block" >
	  </fieldset>
	</form>
	</div>
</div>

<div class="row" id="result" style="margin:10px">
	<pre>
		<h3> status: ${status}</h3>
	</pre>
</div>