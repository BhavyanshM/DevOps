<?php

require_once '/pipeline/index/databaseConnection.php';

class Tester extends PHPUnit_Framework_TestCase
{

    public $test;

    /** Testing the connection to the database */
    public function testSetup()
    {

            $dbc = new databaseConnection();
	        $dbc->connect();
            $this->test = $dbc->getGadget(2);

    }

    /** Testing the item methods using the database */
    public function testItem()
    {

           $this->testSetup();
           $this->assertEquals($this->test->getItem(), 2);

    }

    /** Testing the name methods using the database */
	public function testName()
    {

            $this->testSetup();
            $this->assertEquals($this->test->getName(), "High-End Gaming Laptop");

    }

        /** Implement the testCost method below */

        /** Implement the testManufacturer method below */

    /** Testing the image methods using the database */
    public function testImage()
    {

            $this->testSetup();
            $this->assertEquals($this->test->getImageName(), "2.jpg");

    }

    /** Testing the model methods using the database */
    public function testModel()
    {

            $this->testSetup();
            $this->assertEquals($this->test->getModel(), "Alien M17x");

    }

    /** Testing the link methods using the database */
    public function testLink()
    {

            $this->testSetup();
            $this->assertEquals($this->test->getLink(), "www.amazon.com");

    }

    /** Testing the icon methods using the database */
    public function testIcon()
    {

            $this->testSetup();
            $this->assertEquals($this->test->getIcon(), "res2.jpg");

    }

}
?>
