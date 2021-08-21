/**
 * Создать систему для учета документов. TeachMeSkills Lesson 3 HW
 */

import com.tms.contract.*;
import com.tms.registry.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Main class to demonstrate how program works
 * Contains all instances of classes with set values, that will be printed with the help of method from Register class
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        EmployeeContract workerBob = new EmployeeContract();
        workerBob.employeeName = "Bob";
        workerBob.documentNumber = "PR7155678";
        workerBob.documentDate = new Date(100 + 21, Calendar.JUNE, 5); // 100 + 21 for clarity 'cause 1900 will be added to the year variable from the Date class
        workerBob.contractExpirationDate = new SimpleDateFormat("MM/dd/yyyy").parse("08/16/2023"); // also, we can use SimpleDateFormat

        EmployeeContract workerTom = new EmployeeContract();
        workerTom.employeeName = "Tom";
        workerTom.documentNumber = "TL5823976";
        workerTom.documentDate = new Date (121, Calendar.JANUARY, 7);
        workerTom.contractExpirationDate = new Date (125, Calendar.JANUARY, 7);

        FinancialInvoice securityDepartment = new FinancialInvoice();
        securityDepartment.documentNumber = "765678256";
        securityDepartment.departmentCode = "SCR";
        securityDepartment.documentDate = new Date (120, Calendar.MARCH, 18);
        securityDepartment.totalMonthSum = 160781;

        FinancialInvoice aviationDepartment = new FinancialInvoice();
        aviationDepartment.documentNumber = "562987359";
        aviationDepartment.departmentCode = "AVT";
        aviationDepartment.documentDate = new Date (119, Calendar.SEPTEMBER, 12);
        aviationDepartment.totalMonthSum = 52622;

        GoodsSupplyContract supermarketChicago = new GoodsSupplyContract();
        supermarketChicago.goodsType = "Food";
        supermarketChicago.goodsAmount = 156;
        supermarketChicago.documentNumber = "F15277651";
        supermarketChicago.documentDate = new Date(117, Calendar.NOVEMBER, 16);

        Register registrationOffice = new Register();
        registrationOffice.saveDocumentInRegister(workerBob);
        registrationOffice.saveDocumentInRegister(workerTom);
        registrationOffice.saveDocumentInRegister(securityDepartment);
        registrationOffice.saveDocumentInRegister(aviationDepartment);
        registrationOffice.saveDocumentInRegister(supermarketChicago);

        System.out.println(registrationOffice.getDocumentInfo(workerBob));
        System.out.println(registrationOffice.getDocumentInfo(registrationOffice.documentsArray[3]));
        System.out.println(registrationOffice.getDocumentInfo(registrationOffice.documentsArray[4]));
    }
}