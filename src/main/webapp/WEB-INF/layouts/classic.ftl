<#ftl encoding='UTF-8'>
<html>
<head>
	<title><@tiles.insertAttribute name="title" /></title>
	<link rel="stylesheet" href="resources/css/custom.css">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<meta charset=UTF-8">
	
	<style>
		html{
		    overflow-y:scroll;
		}
	
	</style>
	
	<script>
			var checkScrollBars = function(){
		    var b = $('body');
		    var normalw = 0;
		    var scrollw = 0;
		    if(b.prop('scrollHeight')>b.height()){
		        normalw = window.innerWidth;
		        scrollw = normalw - b.width();
		        $('#container').css({marginRight:'-'+scrollw+'px'});
		    }
		}
		
		$(function(){
		    checkScrollBars();
		    $('#showbar').click(function(){
		        $('body').css('overflow-y', 'auto');
		        checkScrollBars();
		    })
		    $('#hidebar').click(function(){
		        $('body').css('overflow-y', 'hidden');
		        checkScrollBars();
		    })
		});
			
	</script>
</head>
<body>
	
		<@tiles.insertAttribute name="header" />

		<div class="container">
		  <div class="row">
		    <div class="col-md-3">
		       <@tiles.insertAttribute name="menu"/>
		    </div>
		    <div class="col-md-7">
		      	<@tiles.insertAttribute name="body" />
		    </div>
		    <div class="clearfix visible-lg"></div>
		  </div>
		</div>
		<@tiles.insertAttribute name="footer" />
	
</body>
</html>