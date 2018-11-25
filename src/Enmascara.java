public class Enmascara {

	public static String enmascara(String texto){
		String texto_enmascarado = "";
		
		for (int i = 0; i < texto.length(); i++){
			if (i < texto.length() - 4) {
				texto_enmascarado += "#";
			}else {
				texto_enmascarado += texto.charAt(i);
			}
		}
		return texto_enmascarado;
	}
}
