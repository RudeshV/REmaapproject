package org.stepdefenition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
public static void generateJVMReport(String b) {
File F = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReport");
Configuration con = new Configuration(F, "REmaap Project");
con.addClassifications("Platform", "Windows");
con.addClassifications("Version", "10");
con.addClassifications("Browser", "Chrome");
con.addClassifications("version", "89.0");
List<String> li = new ArrayList<String>();
li.add(b);
ReportBuilder r = new ReportBuilder(li, con);
r.generateReports();
}
}
