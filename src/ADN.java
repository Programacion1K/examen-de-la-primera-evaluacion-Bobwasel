public class ADN {

	public static String devuelveComplementario(String lado_adn){
		String complementario_adn = "";
		
		for (int i = 0; i < lado_adn.length(); i++){
			char caracter_actual = lado_adn.charAt(i);
			
			if (caracter_actual == 'A') {
				complementario_adn += 'T';
			}else if (caracter_actual == 'T') {
				complementario_adn += 'A';
			}else if (caracter_actual == 'C') {
				complementario_adn += 'G';
			}else {
				complementario_adn += 'C';
			}
		}
		return complementario_adn;
	}
	
	public static void main(String[] args) {
		System.out.println("ADN.devuelveComplementario (\"ATTGC\") // return \"TAACG\"");
		System.out.println(ADN.devuelveComplementario ("ATTGC"));
		System.out.println("ADN.devuelveComplementario (\"GTAT\") // return \"CATA\"");
		System.out.println(ADN.devuelveComplementario ("GTAT"));
	}
}
