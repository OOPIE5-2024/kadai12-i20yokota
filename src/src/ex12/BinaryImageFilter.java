package src.ex12;

public class BinaryImageFilter implements Processable {

	@Override
	public void process(GrayImage img) {
		// TODO Auto-generated method stub
		final int BORDER = 128;	//二値化の閾値
		int color;
		int height = img.getHeight();
		int width = img.getWidth();
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				color = img.getGray(i,j);
				if(color < BORDER) {	//ボーダーと比較して白黒を決める
					img.setGray(i,j,0xff000000);
				}else {
					img.setGray(i,j,0xffffffff);
				}
			}
		}

		

	}

}
