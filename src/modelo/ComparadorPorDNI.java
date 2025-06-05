package modelo;

import java.util.Comparator;
import interfaces.IPersona;

public class ComparadorPorDNI implements Comparator<IPersona> {
	@Override
	public int compare(IPersona p1, IPersona p2) {
		return p1.getDni().compareTo(p2.getDni());
	}
}


