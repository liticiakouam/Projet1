package com.hemebiotech.analytics;

import java.util.List;

/**
 * ENGLISH
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 *
 * FRANCAIS
 * Je vous donne une interface pour vous permettre de lire un fichier dans une source
 * Il retourne les resultats sous forme de chaine de caractère
 */
public interface ISymptomReader {
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */
	List<String> getSymptoms();
}
