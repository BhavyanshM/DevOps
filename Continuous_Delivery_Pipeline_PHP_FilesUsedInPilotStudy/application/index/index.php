<!DOCTYPE html>

<html>

<head>
<meta charset="utf-8">
<title>Gadget</title>
<link rel="stylesheet" href="main.css">
</head>

<body>
	<div id="big_wrapper">


	<header id="header">Gadget Inventory!</header>
	<!-- Displaying the navigation bar -->
	<nav id="navigation">
		<ul>Home</ul>
                <ul>About</ul>
                <ul>Contact</ul>
                <ul>Gadgets</ul>
	</nav>

<!-- Establishing a connection to the sql database -->
<?php

	require_once('databaseConnection.php');
	$dbc = new databaseConnection();
	$dbc->connect();
	if($_GET['pic']!=NULL)
	$G = $dbc->getGadget($_GET['pic']);
	else $G = $dbc->getGadget(1);

?>
	<!-- The right side bar's data -->
    <aside id="left_side">
        <ul><b>Type </b><br/><p><?php echo $G->getName(); ?></p></ul>
        <ul><b>Manufacturer </b><br/><p><!-- Add call to getManufacturer method here --></p></ul>
        <ul><b>Cost </b><br/><p><!-- Add call to getCost method here --><p></ul>
        <ul><b>Amazon </b><br/><a href="<?php $G->getLink(); ?>"><?php echo $G->getModel(); ?></a></ul>
    </aside>

	<!-- Displaying the main image -->
	<section id="gadget">
		<?php

			echo '<img src="./Resources/';
			echo $G->getImageName();
			echo '">';

		?>
	</section>

	<section id="icons">
		<div>
			<a href="index.php?pic=1" id="one"><img src="./Resources/<?php echo $dbc->getGadget(1)->getIcon();?>"></a>
			<a href="index.php?pic=2" id="two"><img src="./Resources/<?php echo $dbc->getGadget(2)->getIcon();?>"></a>
		</div>
	</section>

	</div>

</body>

</html>
