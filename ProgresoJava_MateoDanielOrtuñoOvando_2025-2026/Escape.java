public class Escape {

	public static void main (String[] args) {
		String cabecera = "\n\tHORARIO DE CLASES:\n" ;
		cabecera += "\n\tLunes\tMartes\tMiercoles\tJueves\tViernes\n" ;
		cabecera += "\t-----\t------\t---------\t------\t--------\n" ;
		
		String asignaturas = "\tPROGR\tBADAT\tBADAT\t\tPROGR\tSIINF\n" ;
		asignaturas += "\tPROGR\tBADAT\tBADAT\t\tPROGR\tSIINF|\n";
		asignaturas += "\tSIINF\tENDES\tDASPGS\t\tSIINF\tDASPGS\n";
		asignaturas += "\t------------------------------------------------\n" ;
		asignaturas += "\tRECREO\tRECREO\tRECREO\t\tRECREO\tRECREO\n" ;
		asignaturas += "\t------------------------------------------------\n" ;
		asignaturas += "\t|SIINF\tENDES\tPROGR\t\tSIINF\tDASPGS|\n";
		asignaturas += "\tIPE2\tLMSGI\tPROGR\t\tBADAT\tENDES\n";
		asignaturas += "\tiPE2\tLMSGI\tLMSGI\t\tSASP\tIPE2\n";
		System.out.print(cabecera+asignaturas) ;
	}
} 