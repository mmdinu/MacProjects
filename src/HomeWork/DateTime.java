package HomeWork;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;

class CurrentDateTime {

    public static void main ( String[] args ) {
        LocalDateTime current = LocalDateTime.now ();

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime ( FormatStyle.MEDIUM );
        String formatted = current.format ( formatter );

        System.out.println ( "Current Date is: " + formatted );
        System.out.println ();


        //Using Date class
        Date date = new Date ();
        //Pattern for showing milliseconds in the time "SSS"
        DateFormat sdfc = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String stringDate = sdfc.format ( date );
        System.out.println ( stringDate );

        //Using Calendar class
        Calendar cal = Calendar.getInstance ();
        String stringDate2 = sdfc.format ( cal.getTime () );
        System.out.println ( stringDate2 );
        System.out.println ();


        //Displaying current time in 12 hour format with AM/PM
        DateFormat dateFormat = new SimpleDateFormat ( "hh.mm aa" );
        String dateString = dateFormat.format ( new Date () );
        System.out.println ( "Current time in AM/PM: " + dateString );

        //Displaying current date and time in 12 hour format with AM/PM
        DateFormat dateFormat2 = new SimpleDateFormat ( "dd/MM/yyyy hh.mm aa" );
        String dateString2 = dateFormat2.format ( new Date () );
        System.out.println ( "Current date and time in AM/PM: " + dateString2 );
        System.out.println ();

        //Displaying given time in 12 hour format with AM/PM
        String dateString3 = "22.30";
        //old format
        SimpleDateFormat sdf = new SimpleDateFormat ( "HH.mm" );
        try {
            Date date3 = sdf.parse ( dateString3 );
            //new format
            SimpleDateFormat sdf2 = new SimpleDateFormat ( "hh.mm aa" );
            //formatting the given time to new format with AM/PM
            System.out.println ( "Given time in AM/PM: " + sdf2.format ( date3 ) );
        } catch ( ParseException e ) {
            e.printStackTrace ();
        }

        //Displaying given time in 12 hour format with AM/PM
        String dateString4 = "21/12/2016 21.20";
        //old format
        SimpleDateFormat sdf3 = new SimpleDateFormat ( "dd/MM/yyyy HH.mm" );
        try {
            Date date4 = sdf3.parse ( dateString4 );
            //new format
            SimpleDateFormat sdf4 = new SimpleDateFormat ( "dd/MM/yyyy hh.mm aa" );
            //formatting the given time to new format with AM/PM
            System.out.println ( "Given date and time in AM/PM: " + sdf4.format ( date4 ) );
        } catch ( ParseException e ) {
            e.printStackTrace ();

        }
    }
}