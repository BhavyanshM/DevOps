<?php


class Gadget {

	private $item;
    private $name;
    private $model;
	private $cost;
    private $manufacturer;
    private $link;
	private $imgName;
	private $icon;

	/** Creating a gadget with the different parameters */
	public function __construct($item, $name, $model, $cost, $manufacturer, $link, $imgName, $icon)
	{

		$this->setItem($item);
		$this->setName($name);
		$this->setModel($model);
		$this->setCost($cost);
		$this->setManufacturer($manufacturer);
		$this->setLink($link);
		$this->setImageName($imgName);
		$this->setIcon($icon);

	}

	/** Sets the item ID of the gadget */
	public function setItem($item)
	{

		$this->item = $item;

	}

	/** Sets the name of the gadget */
	public function setName($name)
	{

		$this->name = $name;

	}

	/** Sets the model of the gadget */
    public function setModel($model)
	{

	       	$this->model = $model;

	}

	/** Sets the cost of the gadget */
	public function setCost($cost)
	{

	        $this->cost =  $cost;

	}

	/** Sets the manufacturer of the gadget */
 	public function setManufacturer($manufacturer)
	{

	        $this->manufacturer = $manufacturer;

	}

	/** Sets the link of the gadget */
	public function setLink($link)
	{

	    	$this->link = $link;

	}

	/** Sets the image name of the gadget */
	public function setImageName($imgName)
	{

	    	$this->imgName = $imgName;

	}

	/** Sets the icon of the gadget */
	public function setIcon($icon)
	{

	    	$this->icon = $icon;

	}

	/** Returns the name of the gadget */
    public function getName()
	{

			return $this->name;

	}

	/** Returns the model of the gadget */
   	public function getModel()
	{

	    	return $this->model;

	}

	/** Add the getCost method below */

	/** Add the getManufacturer method below */

	/** Returns the link of the gadget */
	public function getLink()
	{

	    	return $this->link;

	}

	/** Returns the item ID of the gadget */
	public function getItem()
	{

	        return $this->item;

	}

	/** Returns the image name of the gadget */
	public function getImageName()
	{

	        return $this->imgName;

	}

	/** Returns the icon of the gadget */
	public function getIcon()
	{

	        return $this->icon;

	}

}
?>
