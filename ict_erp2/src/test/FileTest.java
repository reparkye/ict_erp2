package test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



class FileItem{
	private String name;
	private String string;
	@Override
	public String toString() {
		return "FileItems [name=" + name + ", string=" + string + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public FileItem(String name, String string) {
		super();
		this.name = name;
		this.string = string;
	}
}
public class FileTest {
	
	public static List<FileItem> parse(){
		List<FileItem> fList = new LinkedList<FileItem>();
		FileItem fi = new FileItem("tmName","신과함께");
			fList.add(fi);
			fi = new FileItem("tcPrice","20000");
			fList.add(fi);
			fi = new FileItem("tcDesc","dzez");
			fList.add(fi);
			return fList;
		}
	public static void main(String[] args) {
		List<FileItem> fList = parse();			// parse 는 무조건 리스트타입을 뱉어낸다.
		Map<String,String> params = new HashMap<String,String>();
		
		for(FileItem fi: fList) {
			params.put(fi.getName(), fi.getString());
			//if(fi.getName().equals("tmName")) {
		}
			System.out.println(params.get("tmName"));
		}				
	}

