<!DOCTYPE html>

<html>

<head>
<meta charset="utf-8">
<title>Gadgets</title>
<link rel="stylesheet" href="main.css">
</head>

<body>
	<div id="big_wrapper">

	<header id="header">GADGET INVENTORY</header>
	<nav id="navigation">
		<ul>Home</ul>
                <ul>About</ul>
                <ul>Contact</ul>
                <ul>Gadgets</ul>
	</nav>
<?php 

	require_once('Gadget.php');	
	$A = new Gadget(0);
	$B = new Gadget(1);
	$main =new Gadget(0);
                        if($_GET['pic']==1){
                                $main = $A;
                        }       
                        else if ($_GET['pic']==2){
                               $main = $B;
                        }
                        else {}

?>
        <aside id="left_side">
                <ul><b>Type </b><br/><p><?php echo $main->getName(); ?></p></ul>
                <ul><b>Manufacturer </b><br/><p><?php echo $main->getManufacturer(); ?></p></ul>
                <ul><b>Cost </b><br/><p><?php echo $main->getCost(); ?><p></ul>
                <ul><b>Amazon </b><br/><a href="<?php echo $main->getModel(); ?>">Alienware M17x</a></ul>
                <ul><b>Specifications </b></br><p><?php echo $main->getSpecifications(); ?></p></ul>

        </aside>

        <aside id="right_side">
                <ul>1</ul>
                <ul>2</ul>
                <ul>3</ul>
                <ul>4</ul>
                <ul>5</ul>

        </aside>

	<section id="gadget">
<?php

                        if($_GET['pic']==1){
                                echo '<img src="/Resources/1.jpg">';
                        }       
                        else if ($_GET['pic']==2){
                                echo '<img src="/Resources/2.jpg">';
                        }
			else {
                                echo '<img src="/Resources/1.jpg">';
			}

?>

	</section>	

	<section id="icons">
		<div>
			<a href="index.php?pic=1" id="one"><img src="/Resources/res1.jpg"></a>
			<a href="index.php?pic=2" id="two"><img src="/Resources/res2.jpg"></a>
		</div>
	</section>


	</div>





</body>

</html>

