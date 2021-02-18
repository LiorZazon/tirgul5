package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // targil 1:

        // access modifier - מילה עם משמעות שאומרת מי יכול לגשת לאותו שדה מידע או לפונקציה
        // public - כולם יכולים לגשת למידע הזה לראות אותו ולשנות אותו.
        // default - כאשר לא רושמים כלום לפני שדה מידע בתוך מחלקה משמעו שכל מי שנמצא באותו חבילה יכול לגשת אליו
        // כל מי שנמצא ב-package אחר לא יכול לגשת אליו
        // private - היחיד שיש לו הרשאה לגשת אליו זו אותה מחלקה בלבד

        // targil 2:

        // import - זה אומר שעכשיו אני עומדת לפנות למחלקה אחרת שלא נמצאת בתוך החבילה שלי  package= חבילה
        // אלא בחבילה אחרת ולכן חייב להתבצע import

        //package name- שם הפאקייג' יתאר שם בהתאם למחלקות הנמצאות בתוכו
        // com.company , יש חברות שיהיה רשום שם החברה.שם הצוות וכו

        // targil 3:

        // etgar.

        //targil 4:

        Store s1 = new Store("lin", "meira gold 24", "sara");
        //System.out.println(m_owner_name);

        // we cant print this field because this fields is private,
        // private fields can only be used on their class.

        // targil 5:

        //part a

        //Getter - פונקציה שמבצעת/נותנת גישה לשדה שהוא פרייבט/ בעצם פונקציה שמחזירה את אותו שדה
        //Setter - פונקציה המאפשרת לנו לשנות דברים בשדה

        //part b:

        //יתרונות בשימוש בלומבוק: מהיר וקל, אוטומטי, מייצר את הפונקציה במחלקה אך היא לא נראית בקוד (מאחורי הקלעים)
        // חסרונות בשימוש בלומבוק: לא תמיד הפונקציות האלה יוכלו להתבצע אוטומטית, נצטרך לכתוב אותם בעצמנו.

        //targil 6:

        // נשתמש באות m_ בתחילת שמות של שדות במחלקה כי כך  יודעים שמדובר ב- member של המחלקה
        // כאשר משתמשים במילה this זה אומר שהפונקציה הזאת נלקחה מתוך המחלקה הזאת הנוכחית ולא ממקום אחר.

        //targil 7:

        //guitar class

        //targil 8:

        //extends = מרחיב / יורש
        // השדות והפונקציות אוטומטית מועברים למחלקה היורשת

        //targil 9:

        //etgar

        //targil 10:

        // התשובה היא כן

        //targil 11:

        // כן לשדה מסוג private final ניתן לייצר Getter
        // לא ניתן לייצר לשדה מסוג private final Setter כיוון שהוא קבוע ולא ניתן לשנותו

        // targil 12:

        //class earth inherit class planet

        // targil 13:

        //class Doctor v
        //class Surgeon v
        // class family doctor v

        //targil 14:

        // in a different project

        // targil 15:

        //class aircraft
        //class helicopter
        //class drone

        Drone my_drone = new Drone("DJI", 68, 2, "1 horse power");
        //                           m_manufacturer        68 kamash      2 km              i made it up...
        my_drone.takeOff();

        // airplane will inherit from aircraft.




    }
}