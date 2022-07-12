package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.*;


public class AnalyticsCounter {

	public static void main(String args[]) throws IOException {
		//lecture des symptomes
		ISymptomReader symptomReader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> symptoms = symptomReader.getSymptoms();

		//comptage du nombre d'occurrences de chaque symptome
		ISymptomsCount counter = new SymptomsCounter();
		Map<String, Integer> symptomsWithOccurrences = counter.countSymptoms(symptoms);

		//ecriture dans le fichier de sortie
		ISymptomWrite symptomWrite = new WriteSymptomDataToFile("result.out");
		symptomWrite.writeToFile(symptomsWithOccurrences);

		/*for (String symptom : symptoms) {
			int occurrences = 1;
			if(symptomsMap.containsKey(symptom)) {
				occurrences = symptomsMap.get(symptom);
				occurrences++;
			}
			symptomsMap.put(symptom, occurrences);
		}*/


	}
}