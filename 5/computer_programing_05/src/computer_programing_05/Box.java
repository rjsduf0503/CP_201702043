package computer_programing_05;

public class Box {
		private int width;
		private int height;
		private int length;
		
		public int getWidth(){
			return width;
		}
		public void setWidth(int w){
			width = w;
		}
		public int getLength(){
			return length;
		}
		public void setLength(int l){
			length = l;
		}
		public int getHeight(){
			return height;
		}
		public void setHeight(int h){
			height = h;
		}	
		public int getVolume(){
		    int volume;
			volume = getWidth()*getLength()*getHeight();
			return volume;
	    }
		public void print(){
			System.out.println("������ ���� : " + getWidth());
			System.out.println("������ ���� : " + getLength());
			System.out.println("������ ���� : " + getHeight());
			System.out.println("������ ���� : " + getVolume());
		}
}
