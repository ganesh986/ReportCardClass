package com.example.android.reportcardclass;

/**
 * Created by matteo on 15/05/2017.
 */

public class ReportCard {
    private String mSubject;
    private int mFinalGrade;

    public ReportCard(String Subject, int FinalGrade) {
        this.mSubject = Subject;
        this.mFinalGrade = FinalGrade;
    }

    //This method get the name of the subject
    public String getmSubject(){
        return mSubject;
    }

    //This method set the the name of the subject
    public void setmSubject(String Subject){
        mSubject = Subject;
    }

    //This method get the grade of the subject
    public int getFinalGrade(){
        return mFinalGrade;
    }

    //This method set the the grade of the subject
    public void setFinalGrade(int FinalGrade){
        mFinalGrade = FinalGrade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "Subject =" + mSubject +
                ", Grade ='" + mFinalGrade + '\'' +
                '}';
    }

}
