<?php

require_once('Gadget.php');

class databaseConnection {

	public $dbhost;
	public $dbname;
	public $dbuser;
	public $dbpass;
	public $conn;
	public function __construct(){
	        $this->dbhost = 'db:3306';
	        $this->dbname = 'Tester';
        	$this->dbuser = 'naman';
        	$this->dbpass = 'chocolate';
	}
	public function connect(){
        try {
                $this->conn = new PDO("mysql:host=$this->dbhost;dbname=$this->dbname", $this->dbuser, $this->dbpass);
                }catch(Exception $e){
			echo "Error: " . $e->getMessage();
		}
	}

	public function fetch($id){
       		$this->conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
       		$sql = $this->conn->prepare("SELECT * FROM gadget where srno=$id");
       		$sql->execute();
       		$result = $sql->fetchAll();
  		return $result;
	}


	public function createGadget($id){
		foreach($this->fetch($id) as $row){
			$gadget = new Gadget(	$row['srno'],
						$row['Type'],
						$row['Name'],
						$row['Cost'],
						$row['Brand'],
						$row['Link'],
						$row['imgPath'],
						$row['icon']	);
		}
		return $gadget;

	}

	public function getGadget($ID){
		return $this->createGadget($ID);

	}
}
?>
