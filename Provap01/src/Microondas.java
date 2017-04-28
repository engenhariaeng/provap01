
public class Microondas {
	
	// atributos
	
	boolean status;
	boolean porta;
	
	// construtor
	
	Microondas() {
		
	}

	
	// get & set
	
	
	public boolean getstatus(){
		return status;
	}

	public void setStatus(boolean status){
		
		if(status == true){
			System.out.println("microonda ligado.");
		}
		else{
			System.out.println("micronda desligado.");
		}
	

	}
	
	public boolean getPorta(){
		return porta;
	}
	
	public void setPorta(boolean porta){
		
		if(porta == true){
			System.out.println("a porta esta aberta.");
		}
	
		else{
			System.out.println("a porta esta fechada.");
		}
	
		if(status = true){
			porta = true;
		}
		
		else{
			porta = false;
		}
	
	}
	
	boolean ligarMicro(){
		status = true;
		return status;
	}
		
	boolean desligarMicro(){
		status = false;
		return status;
	}





















}


	














