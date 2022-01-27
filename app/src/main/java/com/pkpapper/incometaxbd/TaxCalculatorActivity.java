package com.pkpapper.incometaxbd;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import org.joda.time.Period;
import org.joda.time.PeriodType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TaxCalculatorActivity extends AppCompatActivity {

    private TextView taxableIncomeTv,tax;

    int age;

    int totalTax;

    //////////////head of income

    private EditText basicSalary,houseAllowance,conveyanceAllowance,medicalAllowance,yearlyBonus,investment;
    int totalTaxableIncome = 0;

    //////////////head of income

    private TextView dobText;

    //////////checkedbox
    CheckBox disable,guardiandisable,freedom;
    String checked;
    //////////checkedbox


    ////////location
    private Spinner location;
    String selectedlocation;
    ////////location


    //private ImageButton dobBtn;
    String mbirthday,mtoday;
    String selectedgender;
    DatePickerDialog.OnDateSetListener dateSetListener;

    //private String showGender ="";
    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax_calculator);



        taxableIncomeTv = findViewById(R.id.taxableIncomeTv);
        tax = findViewById(R.id.tax);




        /////////checkedbox

        disable=(CheckBox)findViewById(R.id.disable);
        guardiandisable=(CheckBox)findViewById(R.id.guardiandisable);
        freedom=(CheckBox)findViewById(R.id.freedom);


        /////////checkedbox

        ////////////// for gender
        radioSexGroup = (RadioGroup) findViewById(R.id.radioSex);
        ////////////// for gender


        location = findViewById(R.id.location);


        ///////////////date of birth

        //todayText = findViewById(R.id.dateText);
        dobText  = findViewById(R.id.dobtextBtn);
        //ageText = findViewById(R.id.ageText);

        //dobBtn = findViewById(R.id.dobBtn);
        //calculateBtn = findViewById(R.id.calBtn);

        Calendar calendar = Calendar.getInstance();

        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        mtoday = simpleDateFormat.format(Calendar.getInstance().getTime());
        //todayText.setText(mtoday);

        dobText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(v.getContext(),dateSetListener,year,month,day);
                datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
                datePickerDialog.show();
            }
        });
        dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                month = month+1;
                mbirthday = dayOfMonth+"/"+month+"/"+year;
                dobText.setText("Birthday : "+mbirthday);
            }
        };

        if (mbirthday==null){
            return;
        }else {

            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date date1 = simpleDateFormat1.parse(mbirthday);
                Date date2 = simpleDateFormat1.parse(mtoday);

                long startDate = date1.getTime();
                long endDate = date2.getTime();

                Period period = new Period(startDate, endDate, PeriodType.yearMonthDay());
                int years = period.getYears();
//                        int months = period.getMonths();
//                        int days = period.getDays();

                age = years;


            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        ///////////////date of birth


        //////////////head of income

        basicSalary = findViewById(R.id.basic_Salary);
        houseAllowance = findViewById(R.id.house_Allowance);
        conveyanceAllowance = findViewById(R.id.conveyance_Allowance);
        medicalAllowance = findViewById(R.id.medical_Allowance);
        yearlyBonus = findViewById(R.id.yearly_Bonus);
        investment = findViewById(R.id.invest);
        Button calculateBtn = findViewById(R.id.calculate_btn);





        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //////////////for gender
                //btnDisplay = (Button) findViewById(R.id.btnDisplay);

                // get selected radio button from radioGroup
                int selectedId = radioSexGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioSexButton = (RadioButton) findViewById(selectedId);

                selectedgender = radioSexButton.getText().toString();

                //////////////for gender



                int basic = Integer.parseInt(basicSalary.getText().toString())*12;
                int bonus = Integer.parseInt(yearlyBonus.getText().toString());

                totalTaxableIncome = totalTaxableIncome+basic+bonus;

                int conveyance = (Integer.parseInt(conveyanceAllowance.getText().toString())) *12;
                if (conveyance>30000){
                    totalTaxableIncome = totalTaxableIncome + (conveyance - 30000);

                }else {
                    totalTaxableIncome = totalTaxableIncome + 0;
                }

                ///////medical

                int medical = (Integer.parseInt(medicalAllowance.getText().toString())) *12;

                if(disable.isChecked()){
                   if (medical>1000000){
                       totalTaxableIncome = totalTaxableIncome + (medical - 1000000);
                   }
                }else {

                    if (medical > ((basic * 10) / 100) || medical > 120000) {
                        if (((basic * 10) / 100) < 120000) {

                            totalTaxableIncome = totalTaxableIncome + (medical - ((basic * 10) / 100));

                        } else {
                            totalTaxableIncome = totalTaxableIncome + (medical - 120000);
                        }
                    } else {
                        totalTaxableIncome = totalTaxableIncome + 0;
                    }

                }

                /////medical


                ///////house

                int house = Integer.parseInt(houseAllowance.getText().toString())*12;
                if (house>(basic/2) || house>300000){

                    if ((basic/2)<=300000){
                        totalTaxableIncome = totalTaxableIncome + (house-(basic/2));
                    }else {
                        totalTaxableIncome = totalTaxableIncome + (house-300000);
                    }

                }else {
                    totalTaxableIncome = totalTaxableIncome + 0;
                }

                ///////house

                ////////investment
                int invest = Integer.parseInt(investment.getText().toString());
                if (invest==0){

                }else {
                    int taxcedit = (totalTaxableIncome *25) /100;
                    int cedit;

                    if (totalTaxableIncome<=1000000){

                         cedit = (taxcedit*15)/100;

                    }else if (totalTaxableIncome>1000000 && totalTaxableIncome<=3000000){
                        cedit=((250000*15)/100) +(((taxcedit-250000)*12)/100);

                        cedit = (taxcedit*15)/100;

                    }else if (totalTaxableIncome>3000000){
                        cedit=((250000*15)/100) +((500000*12)/100) + (((taxcedit-750000)*10)/100);
                    }
                }

                ////////investment



                /////////calculate tax



                if (freedom.isChecked()){

                    totalTaxableIncome = totalTaxableIncome - 175000;
                    totalTax =  calculateTax(totalTaxableIncome);


                }else if (disable.isChecked()){
                    totalTaxableIncome = totalTaxableIncome - 150000;
                    totalTax = calculateTax(totalTaxableIncome);

                }else if (guardiandisable.isChecked()){

                    totalTaxableIncome = totalTaxableIncome-50000;
                    totalTax = calculateTax(totalTaxableIncome);

                }else {

                    if (selectedgender.equals("Female") || selectedgender.equals("Third gender")  || (selectedgender.equals("Male") && age >= 65)) {

                        totalTaxableIncome = totalTaxableIncome - 50000;
                        totalTax = calculateTax(totalTaxableIncome);

                    } else {

                        totalTax = calculateTax(totalTaxableIncome);
                    }

                }

                /////////calculate tax


                ///////////location



                selectedlocation = location.getSelectedItem().toString();


                if (selectedlocation.equals("Dhaka or Chittagong city corporation") && totalTax<5000){
                    totalTax = 5000;
                }else if (selectedlocation.equals("Other city corporation") && totalTax<4000){
                    totalTax = 4000;
                }else if (selectedlocation.equals("Area other than city corporation") && totalTax<3000){
                    totalTax = 3000;
                }else {
                    totalTax = totalTax +0;
                }


                ///////////location


                taxableIncomeTv.setText(basic);
                tax.setText(medical);

                Intent intent = new Intent(TaxCalculatorActivity.this,GuidelineActivity.class);
                startActivity(intent);
            }
        });


        //////////////head of income















    }


    private int calculateTax(int taxableIncome){

        int tax =0;

        if (taxableIncome <= 300000) {
            tax = tax + 0;

        } else if (taxableIncome > 300000 && taxableIncome <= 400000) {
            tax = tax + (((taxableIncome - 300000) * 5) / 100);

        } else if (taxableIncome > 400000 && taxableIncome <= 700000) {
            tax = tax + ((100000 * 5) / 100) + (((taxableIncome - 400000) * 10) / 100);

        } else if (taxableIncome > 700000 && taxableIncome <= 1100000) {
            tax = tax + ((100000 * 5) / 100) + ((300000 * 10) / 100) + (((taxableIncome - 700000) * 15) / 100);

        } else if (taxableIncome > 1100000 && taxableIncome <= 1600000) {
            tax = tax + ((100000 * 5) / 100) + ((300000 * 10) / 100) + ((400000 * 15) / 100) + (((taxableIncome-1100000) * 20) / 100);

        } else if (taxableIncome > 1600000) {
            tax = tax + ((100000 * 5) / 100) + ((300000 * 10) / 100) + ((400000 * 15) / 100) + ((500000 * 20) / 100) + (((totalTaxableIncome - 1600000) * 25) / 100);
        }

        return tax;

    }


    ///////////checkedbox

    public void addListenerOnButtonClick(){


        StringBuilder result=new StringBuilder();

        if(disable.isChecked()){
            result.append("a");
        }
        if(guardiandisable.isChecked()){
            result.append("b");

        }
        if(freedom.isChecked()){
            result.append("c");

        }

        checked = result.toString();

    }

    ///////////checkedbox


}