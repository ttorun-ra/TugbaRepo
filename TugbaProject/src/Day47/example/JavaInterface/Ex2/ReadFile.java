package Day47.example.JavaInterface.Ex2;
//add files below to connect, read, save and update date using ex3
//1. TxtFile
//2. PowerPointFile
//3. DMGFile
//4. EXEFile
public interface ReadFile {
	void connect();
	void read();
	void save();
	void Update();
	

}
class TxtFile implements ReadFile{

	@Override
	public void connect() {
		System.out.println("It is connected to readfile ");
		
	}

	@Override
	public void read() {
		System.out.println("It is readable text");
		
	}

	@Override
	public void save() {
	System.out.println("It is better save the text");
		
	}

	@Override
	public void Update() {
		System.out.println("Updated date is added");
		
	}
	
}

class PowerPointFile implements ReadFile{

	@Override
	public void connect() {
		System.out.println("It comes from ReadFile");
		
	}

	@Override
	public void read() {
		System.out.println("It is readable PPT");
		
	}

	@Override
	public void save() {
		System.out.println("It is not saved");
		
	}

	@Override
	public void Update() {
		System.out.println("Updated");
		
	}
	
}
class DMGFile implements ReadFile{

	@Override
	public void connect() {
		System.out.println("It is connected easily");
	}

	@Override
	public void read() {
		System.out.println("It is readable dmg");
		
	}

	@Override
	public void save() {
		System.out.println("save it");
		
	}

	@Override
	public void Update() {
		System.out.println("needed to be updated");
		
	}
	
}
class EXEFile implements ReadFile{

	@Override
	public void connect() {
		System.out.println("It couldn't connect");
		
	}

	@Override
	public void read() {
		System.out.println("It is readable text");
		
	}

	@Override
	public void save() {
		System.out.println("It cannot be saved");
	}

	@Override
	public void Update() {
		System.out.println("update it");
		
	}
	
}