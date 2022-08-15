package funix;

import java.util.Scanner;

public class GradeStudent {
	private static Scanner sc = new Scanner(System.in);
	private static String midWeight;
	private static String midScoreEarned;
	private static String midScoreShifted;
	private static String midTotalPoints;
	private static String midWeightedScore;
	private static String finalWeight;
	private static String finalScoreEarned;
	private static String finalScoresShifted;
	private static String finalShiftAmount;
	private static String finalTotalPoints;
	private static String finalWeightedScore;
	private static String homeWeight;
	private static String homeNoOfAssignments;
	private static String[] homeScoreAndMax;
	private static String homeSections;
	private static String homeSectionPoints;
	private static String homeTotalPoints;
	private static String homwWeightedScore;

	public static void main(String[] args) {
		begin();
		midterm();
		finalterm();
		homework();
		report();
	}

	public static void begin() {
		System.out.println("This program reads exam/homework scores and reports your overall course grade");
	}

	public static void midterm() {
		System.out.println("Midterm:");
		System.out.println("Weight (0-100):");
		midWeight = sc.next(); // 20

		System.out.println("Score earned:");
		midScoreEarned = sc.next(); // 78

		System.out.println("Were scores shifted (1 = yes, 2=no):");
		midScoreShifted = sc.next(); // 2 = 0
		if (midScoreShifted.equals("2")) {
			midScoreShifted = "0";
		}
		System.out.println("Total points:");
		double midTotalPoints = (78 / 100) * 20;

		System.out.println("midTotalPoints: " + (Integer.parseInt(midScoreEarned) + Integer.parseInt(midScoreShifted)));

		System.out.println("Weighted score:" + midTotalPoints);
	}

	public static void finalterm() {
		System.out.println("Final:");
		System.out.println("Weight (0-100):");
		finalWeight = sc.next();

		System.out.println("Score earned:");
		finalScoreEarned = sc.next();

		System.out.println("Were scores shifted (1 = yes, 2=no):");
		finalScoresShifted = sc.next();

		System.out.println("Shift amount:");
		finalShiftAmount = sc.next();

		System.out.println("Total points:");
		finalTotalPoints = sc.next();

		System.out.println("Weighted score:");
		finalWeightedScore = sc.next();
	}

	public static void homework() {
		System.out.println("Homework:");
		System.out.println("Weight (0-100):");
		homeWeight = sc.next();

		System.out.println("Number of assignments:");
		homeNoOfAssignments = sc.next();
		int num = Integer.parseInt(homeNoOfAssignments);
		homeScoreAndMax = new String[num];

		for (int i = 0; i < num; i++) {
			System.out.println("Assignment " + (i + 1) + " score and max");
			homeScoreAndMax[i] = sc.next();
		}

		System.out.println("How many sections did you attend:");
		homeSections = sc.next();

		System.out.println("Section points:");
		homeSectionPoints = sc.next();

		System.out.println("Total points:");
		homeTotalPoints = sc.next();

		System.out.println("Weighted score:");
		homwWeightedScore = sc.next();
	}

	public static void report() {

	}
}
