package com.connectrivier.action;

import java.io.File;
import java.io.FileOutputStream;
 



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 



import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import com.connectrivier.form.UploadForm;
import com.connectrivier.form.UploadPostForm;
 

public class UploadPostAction extends Action{
	
	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";
 
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
	    HttpServletRequest request, HttpServletResponse response)
	    throws Exception {
		
		 UploadPostForm uploadForm = (UploadPostForm) form;
		  FileOutputStream outputStream = null;
		  FormFile formFile = null;
		  try {
		      formFile = uploadForm.getFile();
		      String path = getServlet().getServletContext().getRealPath("")+"/"+
		      formFile.getFileName();
		      outputStream = new FileOutputStream(new File(path));
		      outputStream.write(formFile.getFileData());
		      System.out.println("outputstream is" + outputStream);
		      System.out.println("path is" + path);
		  } 
		  finally {
		      if (outputStream != null) {
		          outputStream.close();
		      }
		  }
		uploadForm.setMessage("The file "+formFile.getFileName()+" is uploaded successfully.");
		System.out.println("The file "+formFile.getFileName()+" is uploaded successfully.");
		return mapping.findForward(SUCCESS);
		
		
 
//	    UploadPostForm fileUploadForm = (UploadPostForm)form;
// 
//	    FormFile file = fileUploadForm.getFile();
// 
//	    //Get the servers upload directory real path name
//	    String filePath = 
//               getServlet().getServletContext().getRealPath("/") +"upload";
// 
//	    //create the upload folder if not exists
//	    File folder = new File(filePath);
//	    if(!folder.exists()){
//	    	folder.mkdir();
//	    }
// 
//	    String fileName = file.getFileName();
// 
//	    if(!("").equals(fileName)){  
// 
//	        System.out.println("Server path:" +filePath);
//	        File newFile = new File(filePath, fileName);
// 
//	        if(!newFile.exists()){
//	          FileOutputStream fos = new FileOutputStream(newFile);
//	          fos.write(file.getFileData());
//	          fos.flush();
//	          fos.close();
//	        }  
// 
//	        request.setAttribute("uploadedFilePath",newFile.getAbsoluteFile());
//	        request.setAttribute("uploadedFileName",newFile.getName());
//	    }
//		return mapping.findForward("success");
//	}
	}
}