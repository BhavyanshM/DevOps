<?php

require_once 'Gadget.php';

class Tester extends PHPUnit_Framework_TestCase{
        public $test;

        public function testName(){
                $this->test=new Gadget(0);
                $this->assertEquals($this->test->getName(), "Gaming Laptop");
        }
        public function testManufacturer(){
                $this->test=new Gadget(0);
                $this->assertEquals($this->test->getManufacturer(), "\nAlienware");
        }
        public function testCost(){
                $this->test=new Gadget(0);
                $this->assertEquals($this->test->getCost(), "\n$699");
        }
        public function testModel(){
                $this->test=new Gadget(0);
                $this->assertEquals($this->test->getModel(), "\nhttps://www.amazon.com/Alienware-M17X-17-3-Black-Laptop/dp/B0054Y5X36");
        }
        public function testSpecifications(){
                $this->test=new Gadget(0);
                $this->assertEquals($this->test->getSpecifications(), "\n\nScreen Size: 17.3 inches
Max Screen Resolution: 1600 x 900
Processor: 2 GHz Core i7-2630QM
RAM: 8 GB DDR3
Hard Drive: 750 GB SSD
Graphics Coprocessor: AMD Radeon HD 6870M
Chipset Brand: AMD
Card Description: dedicated
Graphics Card Ram Size: 1000 MB");
        }

        public function testFileContent(){
                $this->test=new Gadget(0);
                $this->assertEquals($this->test->fileContent(0), "Gaming Laptop;
Alienware;
$699;
https://www.amazon.com/Alienware-M17X-17-3-Black-Laptop/dp/B0054Y5X36;

Screen Size: 17.3 inches
Max Screen Resolution: 1600 x 900
Processor: 2 GHz Core i7-2630QM
RAM: 8 GB DDR3
Hard Drive: 750 GB SSD
Graphics Coprocessor: AMD Radeon HD 6870M
Chipset Brand: AMD
Card Description: dedicated
Graphics Card Ram Size: 1000 MB;
");
        }
        public function testGetField(){
                $this->test=new Gadget(0);
                $this->assertEquals($this->test->getField(0), "Gaming Laptop");
        }

}
?>

