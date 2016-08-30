<?php


class Gadget {

	public $item;
       	public $name;
       	public $model;
	public $cost;
       	public $manufacturer;
       	public $specifications;

	public function __construct($item){
		$this->item = $item;
		$this->setName();
		$this->setModel();
		$this->setCost();
		$this->setManufacturer();
		$this->setSpecifications();
	}




	public function fileContent($num)
	{
		$tempArray = array();
		$temp = file_get_contents('./gadgetinfo.txt');
		$tempArray = explode("|", $temp);
		return $tempArray[$num];
	}
	
	public function getField($num)
	{	
		$fieldArray = array();
		$temp = $this->fileContent($this->item);
		$fieldArray = explode(";", $temp);
		return $fieldArray[$num];
	}







       	public function setName(){
		$this->name = $this->getField(0);
	} 
        
     	public function setManufacturer(){
                $this->manufacturer = $this->getField(1);
        } 

	public function setCost(){
                $this->cost =  $this->getField(2);
        } 

	
        public function setModel(){
               	$this->model = $this->getField(3);
       	} 

        
	public function setSpecifications(){
               	$this->specifications = $this->getField(4);
       	}






        public function getName(){
               return $this->name;
        } 

       	public function getModel(){
                return $this->model;
        } 

       	public function getCost(){
                return $this->cost;
        }

        public function getManufacturer(){
                return $this->manufacturer;
        }

        public function getSpecifications(){
               	return $this->specifications;
       	}

}



?>


