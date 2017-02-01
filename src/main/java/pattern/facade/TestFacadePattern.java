package pattern.facade;

import static pattern.facade.DBType.*;
import static pattern.facade.ReportType.*;

public class TestFacadePattern {


    public static void main(String[] args) {
        ReportGeneratorFacade.generateReport(MySQL, PDF);
        ReportGeneratorFacade.generateReport(MySQL, HTML);

        ReportGeneratorFacade.generateReport(Oracle, PDF);
        ReportGeneratorFacade.generateReport(Oracle, HTML);
    }

}
