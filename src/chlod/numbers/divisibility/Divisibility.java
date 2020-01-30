package chlod.numbers.divisibility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.lang.Math;

public class Divisibility {

	public static final String version = "v0.1";
	public static final int versioncode = 1;
	
	public static void divisibility(String[] args) {
		int go = 0;
		output("Divisibility version " + version + " (version level " + versioncode + ")");
		output("WARNING: THIS WILL CREATE LARGE FILES AFTER LONG RUNTIMES.");
		String[] nargs = parseArgs(args);
		if (nargs.length != 0) {
			output("Arguments detected. Parsing...");
			if (nargs.length == 1) {
				try {
					int start = Integer.parseInt(nargs[0]);
					output("Found start point. Starting there!");
					devise(start, Long.MAX_VALUE);
				} catch (Exception e) {
					output("Exception catching arguments. Running default options.");
					go = 1;
				}
			} else if (nargs.length == 2) {
				try {
					int start = Integer.parseInt(nargs[0]);
					int end = Integer.parseInt(nargs[1]);
					output("Found start point. Starting there!");
					devise(start, end);
				} catch (Exception e) {
					output("Exception catching arguments. Running default options.");
					go = 1;
				}
			} else {
				output("Too much arguments! Running default options.");
				go = 1;
			}
			if (go == 1) {
				devise(0, Long.MAX_VALUE);
			}
		} else {
			devise(0, Long.MAX_VALUE);
		}
	}
	
	public static String[] parseArgs(String[] args) {
		List<String> newargs = new ArrayList<String>();
		for (String s : args) {
			if (s.substring(0,0) == "-") {
//				String swtch = s.substring(1);
			} else {
				newargs.add(s);
			}
		}
		String[] nonv = new String[newargs.size()];
		for (int i = 0; i <= newargs.size() - 1; i++) {
			nonv[i] = newargs.get(i);
		}
		return nonv;
	}
	
	public static void output(String s) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("[" + dateFormat.format(date) + "] " + s);
	}
	
	public static void devise(int start, long max) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String date = dateFormat.format(new Date());
		File outputfolder = new File("divisibility-output/");
		if (!outputfolder.exists()) {
			outputfolder.mkdir();
		}
		if (!outputfolder.isDirectory()) {
			output("Output folder (\"divisibility-output\") is not a folder! Please delete this file and restart the program.");
			crash(new InvalidPathException("divisibility-output\\", "Output folder is not a folder."));
		} else {
			try {
				File fdone = new File("divisibility-output/processed");
				File ffor2 = new File("divisibility-output/divisible-by-2");
				File ffor3 = new File("divisibility-output/divisible-by-3");
				File ffor4 = new File("divisibility-output/divisible-by-4");
				File ffor5 = new File("divisibility-output/divisible-by-5");
				File ffor6 = new File("divisibility-output/divisible-by-6");
				File ffor7 = new File("divisibility-output/divisible-by-7");
				File ffor8 = new File("divisibility-output/divisible-by-8");
				File ffor9 = new File("divisibility-output/divisible-by-9");
				File fforall = new File("divisibility-output/divisible-by-all");
				File fbenchm = new File("divisibility-output/benchmarks");
				BufferedWriter done = new BufferedWriter(new FileWriter(fdone, true));
				BufferedWriter bwfor2 = new BufferedWriter(new FileWriter(ffor2, true));
				bwfor2.append("DIVISIBILITY - " + version + " - " + date);
				bwfor2.newLine();
				bwfor2.flush();
				BufferedWriter bwfor3 = new BufferedWriter(new FileWriter(ffor3, true));
				bwfor3.append("DIVISIBILITY - " + version + " - " + date);
				bwfor3.newLine();
				bwfor3.flush();
				BufferedWriter bwfor4 = new BufferedWriter(new FileWriter(ffor4, true));
				bwfor4.append("DIVISIBILITY - " + version + " - " + date);
				bwfor4.newLine();
				bwfor4.flush();
				BufferedWriter bwfor5 = new BufferedWriter(new FileWriter(ffor5, true));
				bwfor5.append("DIVISIBILITY - " + version + " - " + date);
				bwfor5.newLine();
				bwfor5.flush();
				BufferedWriter bwfor6 = new BufferedWriter(new FileWriter(ffor6, true));
				bwfor6.append("DIVISIBILITY - " + version + " - " + date);
				bwfor6.newLine();
				bwfor6.flush();
				BufferedWriter bwfor7 = new BufferedWriter(new FileWriter(ffor7, true));
				bwfor7.append("DIVISIBILITY - " + version + " - " + date);
				bwfor7.newLine();
				bwfor7.flush();
				BufferedWriter bwfor8 = new BufferedWriter(new FileWriter(ffor8, true));
				bwfor8.append("DIVISIBILITY - " + version + " - " + date);
				bwfor8.newLine();
				bwfor8.flush();
				BufferedWriter bwfor9 = new BufferedWriter(new FileWriter(ffor9, true));
				bwfor9.append("DIVISIBILITY - " + version + " - " + date);
				bwfor9.newLine();
				bwfor9.flush();
				BufferedWriter bwforall = new BufferedWriter(new FileWriter(fforall, true));
				bwforall.append("DIVISIBILITY - " + version + " - " + date);
				bwforall.newLine();
				bwforall.flush();
				BufferedWriter benchm = new BufferedWriter(new FileWriter(fbenchm, true));
				benchm.append("DIVISIBILITY - " + version + " - " + date);
				benchm.newLine();
				benchm.newLine();
				benchm.flush();
				long sizedone = fdone.length();
				long sizebenchm = fbenchm.length();
				long size2 = ffor2.length();
				long size3 = ffor3.length();
				long size4 = ffor4.length();
				long size5 = ffor5.length();
				long size6 = ffor6.length();
				long size7 = ffor7.length();
				long size8 = ffor8.length();
				long size9 = ffor9.length();
				long sizeall = fforall.length();
				final long startsizedone = fdone.length();
				final long startsizebenchm = fbenchm.length();
				final long startsize2 = ffor2.length();
				final long startsize3 = ffor3.length();
				final long startsize4 = ffor4.length();
				final long startsize5 = ffor5.length();
				final long startsize6 = ffor6.length();
				final long startsize7 = ffor7.length();
				final long startsize8 = ffor8.length();
				final long startsize9 = ffor9.length();
				final long startsizeall = fforall.length();
				Double current = (double) start;
				final long startmili = System.currentTimeMillis();
				long currentmili = System.currentTimeMillis();
				long repetitions = 0;
				long usedbytes = 0;
				while (current <= max) {
					repetitions++;
					if ((current / 2) % 1 == 0)
						bwfor2.append(current.longValue() + "|");
					if ((current / 2) % 1 == 0)
						bwfor2.flush();
					if ((current / 3) % 1 == 0)
						bwfor3.append(current.longValue() + "|");
					if ((current / 3) % 1 == 0)
						bwfor3.flush();
					if ((current / 4) % 1 == 0)
						bwfor4.append(current.longValue() + "|");
					if ((current / 4) % 1 == 0)
						bwfor4.flush();
					if ((current / 5) % 1 == 0)
						bwfor5.append(current.longValue() + "|");
					if ((current / 5) % 1 == 0)
						bwfor5.flush();
					if ((current / 6) % 1 == 0)
						bwfor6.append(current.longValue() + "|");
					if ((current / 6) % 1 == 0)
						bwfor6.flush();
					if ((current / 7) % 1 == 0)
						bwfor7.append(current.longValue() + "|");
					if ((current / 7) % 1 == 0)
						bwfor7.flush();
					if ((current / 8) % 1 == 0)
						bwfor8.append(current.longValue() + "|");
					if ((current / 8) % 1 == 0)
						bwfor8.flush();
					if ((current / 9) % 1 == 0)
						bwfor9.append(current.longValue() + "|");
					if ((current / 9) % 1 == 0)
						bwfor9.flush();
					if ((current / 2) % 1 == 0 && (current / 3) % 1 == 0 && (current / 4) % 1 == 0 && (current / 5) % 1 == 0 && (current / 6) % 1 == 0 && (current / 7) % 1 == 0 && (current / 8) % 1 == 0 && (current / 9) % 1 == 0)
						bwforall.append(current.longValue() + "|");
					if ((current / 2) % 1 == 0 && (current / 3) % 1 == 0 && (current / 4) % 1 == 0 && (current / 5) % 1 == 0 && (current / 6) % 1 == 0 && (current / 7) % 1 == 0 && (current / 8) % 1 == 0 && (current / 9) % 1 == 0)
						bwforall.flush();
					done.append(current.longValue() + "|");
					done.flush();
					if (System.currentTimeMillis() - currentmili > 1000) {
						benchm.append(((System.currentTimeMillis() - startmili) / 1000) + "s of runtime: ");
						benchm.append(repetitions + " computations done.");
						benchm.newLine();
						long occupied = fforall.length() + fdone.length() + ffor2.length() + ffor3.length() + ffor4.length() + ffor5.length() + ffor6.length() + ffor7.length() + ffor8.length() + ffor9.length();
						benchm.append(occupied + " bytes used so far. " + Math.abs(usedbytes - occupied) + " bytes made this second.");
						benchm.newLine();
						benchm.append("BREAKDOWN OF USED BYTES BY FILE:");
						benchm.newLine();
						benchm.append("divisible-by-2 (Numbers Divisible by 2): " + ffor2.length() + "B, " + (ffor2.length() - startsize2 - size2) + "B this second");
						benchm.newLine();
						benchm.append("divisible-by-3 (Numbers Divisible by 3): " + ffor3.length() + "B, " + (ffor3.length() - startsize3 - size3) + "B this second");
						benchm.newLine();
						benchm.append("divisible-by-4 (Numbers Divisible by 4): " + ffor4.length() + "B, " + (ffor4.length() - startsize4 - size4) + "B this second");
						benchm.newLine();
						benchm.append("divisible-by-5 (Numbers Divisible by 5): " + ffor5.length() + "B, " + (ffor5.length() - startsize5 - size5) + "B this second");
						benchm.newLine();
						benchm.append("divisible-by-6 (Numbers Divisible by 6): " + ffor6.length() + "B, " + (ffor6.length() - startsize6 - size6) + "B this second");
						benchm.newLine();
						benchm.append("divisible-by-7 (Numbers Divisible by 7): " + ffor7.length() + "B, " + (ffor7.length() - startsize7 - size7) + "B this second");
						benchm.newLine();
						benchm.append("divisible-by-8 (Numbers Divisible by 8): " + ffor8.length() + "B, " + (ffor8.length() - startsize8 - size8) + "B this second");
						benchm.newLine();
						benchm.append("divisible-by-9 (Numbers Divisible by 9): " + ffor9.length() + "B, " + (ffor9.length() - startsize9 - size9) + "B this second");
						benchm.newLine();
						benchm.append("divisible-by-all (Numbers Divisible by 1 to 9): " + fforall.length() + "B, " + (fforall.length() - startsizeall - sizeall) + "B this second");
						benchm.newLine();
						benchm.append("processed (Processed Numbers): " + fdone.length() + "B, " + (fdone.length() - startsizedone - sizedone) + "B this second");
						benchm.newLine();
						benchm.flush();
						benchm.append("benchmarks (Benchmarks File): " + fbenchm.length() + "B, " + (fbenchm.length() - startsizebenchm - sizebenchm) + "B this second");
						benchm.newLine();
						benchm.newLine();
						benchm.flush();
						currentmili = System.currentTimeMillis();
						usedbytes = occupied;
						sizedone = fdone.length();
						sizebenchm = fbenchm.length();
						size2 = ffor2.length();
						size3 = ffor3.length();
						size4 = ffor4.length();
						size5 = ffor5.length();
						size6 = ffor6.length();
						size7 = ffor7.length();
						size8 = ffor8.length();
						size9 = ffor9.length();
						sizeall = fforall.length();
						repetitions = 0;
					}
					output("Processed number: " + current.longValue());
					current++;
				}
				long occupied = fforall.length() + fdone.length() + ffor2.length() + ffor3.length() + ffor4.length() + ffor5.length() + ffor6.length() + ffor7.length() + ffor8.length() + ffor9.length();
				output("FINISHED.");
				output("Space occupied: " + occupied);
				output("Closing...");
				bwfor2.close();
				bwfor3.close();
				bwfor4.close();
				bwfor5.close();
				bwfor6.close();
				bwfor7.close();
				bwfor8.close();
				bwfor9.close();
				bwforall.close();
				done.close();
				benchm.close();
			} catch (IOException e) {
				output("Error in processing. Crashing!!!");
				crash(e);
			}
		}

	}
	
	public static void crash(Exception e) {
		output("Crashing!!!");
		e.printStackTrace();
		System.exit(1);
	}
	
}
