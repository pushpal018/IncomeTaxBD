package com.pkpapper.incometaxbd;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.joda.time.Period;
import org.joda.time.PeriodType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import soup.neumorphism.NeumorphButton;

public class NewTextActivity extends AppCompatActivity {

    ////////for gender
    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;
    String selectedgender;
    ////////for gender

    /////location
    private Spinner location;
    String selectedlocation;
    /////location


    ///////total tax
     int totalTax ;
    ///////total tax


    /////date of birth
    private TextView dobText;
    String mbirthday,mtoday;
    int age;
    DatePickerDialog.OnDateSetListener dateSetListener;
    /////date of birth

    ///////checked box
    CheckBox disable,guardiandisable,freedom;
    ///////checked box


    /////head of income
    private EditText basicSalary,houseAllowance,conveyanceAllowance,medicalAllowance,yearlyBonus,investment;
    private NeumorphButton calculateBtn;

    /////head of income

    int totalTaxableIncome = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_text);

        getSupportActionBar().hide();

        basicSalary = findViewById(R.id.basic_Salary);
        houseAllowance = findViewById(R.id.house_Allowance);
        conveyanceAllowance = findViewById(R.id.conveyance_Allowance);
        medicalAllowance = findViewById(R.id.medical_Allowance);
        yearlyBonus = findViewById(R.id.yearly_Bonus);
        investment = findViewById(R.id.invest);
        calculateBtn = findViewById(R.id.calculate_Bbtn);


//        display = findViewById(R.id.displayTv);
//        totalTaxableIncomeDisplay = findViewById(R.id.totalTaxableIncomeDisplay);


        ////////checkedbox

        disable=(CheckBox)findViewById(R.id.disable);
        guardiandisable=(CheckBox)findViewById(R.id.guardiandisable);
        freedom=(CheckBox)findViewById(R.id.freedom);

        /////////checkedbox


        //////////////for gender

        radioSexGroup = (RadioGroup) findViewById(R.id.radioSex);

        //////////////for gender

        /////locaton
        location = findViewById(R.id.location);
        ////location


        ///////check input
        basicSalary.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkInpute();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        houseAllowance.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkInpute();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        conveyanceAllowance.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkInpute();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        medicalAllowance.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkInpute();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        yearlyBonus.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkInpute();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        investment.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkInpute();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        ///////check input


        ///////////////date of birth


        dobText  = findViewById(R.id.dobtextBtn);

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






        ///////////////date of birth



        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int basic = Integer.parseInt(basicSalary.getText().toString());
                int house = Integer.parseInt(houseAllowance.getText().toString());
                int conveyance = Integer.parseInt(conveyanceAllowance.getText().toString());
                int medical = Integer.parseInt(medicalAllowance.getText().toString());
                int bonus = Integer.parseInt(yearlyBonus.getText().toString());
                int invest = Integer.parseInt(investment.getText().toString());


                int yearlybasic = basic * 12;

                ////conveyance
                int yearlyconveyance = conveyance * 12;

                if (yearlyconveyance >30000){
                    yearlyconveyance =  yearlyconveyance - 30000;

                }else {
                   yearlyconveyance = 0;
                }

                ////conveyance

                ///////house

                int yearlyhouse = house *12;

                if (yearlyhouse > (yearlybasic/2) || yearlyhouse > 300000){

                    if ((yearlybasic/2)<=300000){
                        yearlyhouse =  (yearlyhouse - (yearlybasic/2));
                    }else {
                        yearlyhouse = yearlyhouse-300000;
                    }

                }else {
                    yearlyhouse = 0 ;
                }

                ///////house

                ///////medical

                int yearlymedical = medical * 12;

                if(disable.isChecked() ){
                    if (yearlymedical > 1000000){
                        yearlymedical = yearlymedical - 1000000;
                    }else {
                       yearlymedical = 0 ;
                    }
                }else {

                    if (yearlymedical > ((yearlybasic * 10) / 100) || yearlymedical > 120000) {
                        if (((yearlybasic * 10) / 100) < 120000) {

                            yearlymedical = (yearlymedical - ((yearlybasic * 10) / 100));

                        } else {
                            yearlymedical =  yearlymedical - 120000;
                        }
                    } else {
                       yearlymedical = 0;
                    }

                }

                /////medical

                totalTaxableIncome = yearlybasic + bonus + yearlyhouse + yearlyconveyance + yearlymedical;

                //totalTaxableIncomeDisplay.setText("Total Taxable Income : "+Integer.toString(totalTaxableIncome));///ai khn a hobe na karon female ar condition gula true hole tkn total taxable kome na

//                sum = basic+house+conveyance+medical+bonus+invest;


                //////gender
                int selectedId = radioSexGroup.getCheckedRadioButtonId();
                radioSexButton = (RadioButton) findViewById(selectedId);
                selectedgender = radioSexButton.getText().toString();
                //////gender



                /////////date of birth

                if (mbirthday==null){
                    Toast.makeText(NewTextActivity.this, "Please Enter your date of birth!", Toast.LENGTH_SHORT).show();
                    return;
                }else {

                    SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        Date date1 = simpleDateFormat1.parse(mbirthday);
                        Date date2 = simpleDateFormat1.parse(mtoday);

                        long startDate = date1.getTime();
                        long endDate = date2.getTime();

                        Period period = new Period(startDate, endDate, PeriodType.yearMonthDay());
                        age = period.getYears();

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }

                /////////date of birth


                ////////calculate tax




                ///ai condition gula 1st ar ta true hole baki gula khaj kore na...tik korte hobe
                if (selectedgender.equals("Female") || selectedgender.equals("Third Gender") || (selectedgender.equals("Male") && age >=65)){

                    totalTaxableIncome = totalTaxableIncome - 50000;
                    //display.setText(Integer.toString(sum) + age);
                }else if (disable.isChecked() && freedom.isChecked() && guardiandisable.isChecked()){
                    totalTaxableIncome = totalTaxableIncome - 175000 - 50000;
                }else if (disable.isChecked() && guardiandisable.isChecked()){
                    totalTaxableIncome = totalTaxableIncome - 150000 - 50000;
                }else if (freedom.isChecked() && guardiandisable.isChecked()){
                    totalTaxableIncome = totalTaxableIncome - 175000 - 50000;
                } else if (disable.isChecked()){
                    totalTaxableIncome = totalTaxableIncome - 150000;
                }else if (freedom.isChecked()){
                    totalTaxableIncome = totalTaxableIncome - 175000;
                }else if (guardiandisable.isChecked()){
                    totalTaxableIncome = totalTaxableIncome - 50000;
                }


                totalTax =  calculateTax(totalTaxableIncome);


                ////tax cedit

                int cedit =0;

                if (invest > 0){
                    int taxcedit = (totalTaxableIncome *25) /100;

                    if (totalTaxableIncome<=1000000){
                        cedit = (taxcedit*15)/100;


                    }else if (totalTaxableIncome>1000000 && totalTaxableIncome<=3000000){
                        cedit=((250000*15)/100) +(((taxcedit-250000)*12)/100);

                    }else if (totalTaxableIncome>3000000){

                        cedit=((250000*15)/100) +((500000*12)/100) + (((taxcedit-750000)*10)/100);
                    }

                }else {
                   cedit = 0 ;
                }



                if (totalTax>cedit) {
                    totalTax = totalTax - cedit;
                }

                ///tax cedit


                //display.setText(Integer.toString(sum) + age);



                ////calculate tax


                /////minimum tax

                ///////////location



                selectedlocation = location.getSelectedItem().toString();


                if (selectedlocation.equals("Dhaka or Chittagong city corporation")  && totalTax < 5000){
                    if (totalTax > 0) {
                        totalTax = 5000;
                    }else {
                        totalTax =  0;
                    }

                }else if (selectedlocation.equals("Other city corporation")  && totalTax < 4000 ){
                    if (totalTax > 0) {
                        totalTax = 4000;
                    }else {
                        totalTax =  0;
                    }
                }else if (selectedlocation.equals("Area other than city corporation") && totalTax < 3000 ){
                    if (totalTax > 0) {
                        totalTax = 3000;
                    }else {
                        totalTax = 0;
                    }
                }

                ///////////location

                /////minimum tax

                Intent calculateIntent = new Intent(NewTextActivity.this,DisplayActivity.class);
                calculateIntent.putExtra("tax",Integer.toString(totalTax));
                calculateIntent.putExtra("taxableIncome",Integer.toString(totalTaxableIncome));
                startActivity(calculateIntent);

               // display.setText("Total Tax : "+Integer.toString(totalTax)+"\n"+"Total Taxable Income : "+totalTaxableIncome );


            }
        });



    }


    private int calculateTax(int taxableIncome){

        int tax =0;

        if (taxableIncome <= 300000) {
           return tax;

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

    private void checkInpute() {
        if(!TextUtils.isEmpty(basicSalary.getText())) {
            if(!TextUtils.isEmpty(houseAllowance.getText())){
                if (!TextUtils.isEmpty(conveyanceAllowance.getText())){
                    if (!TextUtils.isEmpty(medicalAllowance.getText())){
                        if (!TextUtils.isEmpty(yearlyBonus.getText())){
                            if (!TextUtils.isEmpty(investment.getText())){
                                    calculateBtn.setEnabled(true);
                                    calculateBtn.setTextColor(Color.rgb(30,65,117));
                            }else {
                                calculateBtn.setEnabled(false);
                                calculateBtn.setTextColor(Color.argb(50,30,65,117));
                            }
                        }else {
                            calculateBtn.setEnabled(false);
                            calculateBtn.setTextColor(Color.argb(50,30,65,117));
                        }
                    }else {
                        calculateBtn.setEnabled(false);
                        calculateBtn.setTextColor(Color.argb(50,30,65,117));
                    }
                }else {
                    calculateBtn.setEnabled(false);
                    calculateBtn.setTextColor(Color.argb(50,30,65,117));
                }
            }else {
                calculateBtn.setEnabled(false);
                calculateBtn.setTextColor(Color.argb(50,30,65,117));
            }
        }else {
            calculateBtn.setEnabled(false);
            calculateBtn.setTextColor(Color.argb(50,30,65,117));
        }

    }
}