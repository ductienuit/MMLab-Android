package vn.edu.uit.mmlab.modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class FaceResult
{
    private FaceInfor[] range;

    private String fileName;

    private String msg;

    public FaceInfor[] getFaceInfor ()
    {
        return range;
    }

    public void setFaceInfor (FaceInfor[] faceInfor)
    {
        this.range = faceInfor;
    }

    public String getFileName ()
    {
        return fileName;
    }

    public void setFileName (String fileName)
    {
        this.fileName = fileName;
    }

    public String getMsg ()
    {
        return msg;
    }

    public void setMsg (String msg)
    {
        this.msg = msg;
    }

    @Override
    public String toString()
    {
        return "FaceResult [faceInfor = "+range+", fileName = "+fileName+", msg = "+msg+"]";
    }
}


