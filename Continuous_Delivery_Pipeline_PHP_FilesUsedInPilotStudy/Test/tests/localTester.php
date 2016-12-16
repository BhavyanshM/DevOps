<?php

require_once '/pipeline/index/Gadget.php';

class localTester extends PHPUnit_Framework_TestCase{
        public $test;

        public function testName(){
            $this->test = new Gadget(1, "Gaming Laptop", "Alienware-M17X", "$699", "Alienware", "", "1.jpg", "res1.jpg");
                $this->assertEquals($this->test->getName(), "Gaming Laptop");
        }
        public function testManufacturer(){
            $this->test = new Gadget(1, "Gaming Laptop", "Alienware-M17X", "$699", "Alienware", "https://www.amazon.com/Alienware-M17X-17-3-Black-Laptop/dp/B0054Y5X36", "1.jpg", "res1.jpg");
                $this->assertEquals($this->test->getManufacturer(), "Alienware");
        }
        public function testCost(){
            $this->test = new Gadget(1, "Gaming Laptop", "Alienware-M17X", "$699", "Alienware", "https://www.amazon.com/Alienware-M17X-17-3-Black-Laptop/dp/B0054Y5X36", "1.jpg", "res1.jpg");
                $this->assertEquals($this->test->getCost(), "$699");
        }
        public function testModel(){
            $this->test = new Gadget(1, "Gaming Laptop", "Alienware-M17X", "$699", "Alienware", "https://www.amazon.com/Alienware-M17X-17-3-Black-Laptop/dp/B0054Y5X36", "1.jpg", "res1.jpg");
                $this->assertEquals($this->test->getModel(), "Alienware-M17X");
        }
        public function testLink(){
            $this->test = new Gadget(1, "Gaming Laptop", "Alienware-M17X", "$699", "Alienware", "https://www.amazon.com/Alienware-M17X-17-3-Black-Laptop/dp/B0054Y5X36", "1.jpg", "res1.jpg");
                $this->assertEquals($this->test->getLink(), "https://www.amazon.com/Alienware-M17X-17-3-Black-Laptop/dp/B0054Y5X36");
        }
        public function testImage(){
            $this->test = new Gadget(1, "Gaming Laptop", "Alienware-M17X", "$699", "Alienware", "https://www.amazon.com/Alienware-M17X-17-3-Black-Laptop/dp/B0054Y5X36", "1.jpg", "res1.jpg");
                $this->assertEquals($this->test->getImageName(), "1.jpg");
        }
        public function testIcon(){
            $this->test = new Gadget(1, "Gaming Laptop", "Alienware-M17X", "$699", "Alienware", "https://www.amazon.com/Alienware-M17X-17-3-Black-Laptop/dp/B0054Y5X36", "1.jpg", "res1.jpg");
                $this->assertEquals($this->test->getIcon(), "res1.jpg");
        }
        public function testItem(){
            $this->test = new Gadget(1, "Gaming Laptop", "Alienware-M17X", "$699", "Alienware", "https://www.amazon.com/Alienware-M17X-17-3-Black-Laptop/dp/B0054Y5X36", "1.jpg", "res1.jpg");
                $this->assertEquals($this->test->getItem(), 1);
        }
}
?>
