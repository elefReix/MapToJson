import groovy.json.JsonOutput

class Main {

	static main(args) {
		//Definicion del mapa
		def map = [nombre : "jesus", edad : 26]
		//Serializando
		def objSon = JsonOutput.toJson(map)
		//Definicion del path y archivo  
		def fichero = new File ("/home/elef/Documents","person.json")
		//Escribiendo
		println "Escribiendo..."
		fichero.write(objSon)	
		println "Termino de escribir"	
	}

}
