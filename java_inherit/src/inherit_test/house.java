package inherit_test;
//���� 307��
public abstract class house {

	public static int makedate = 20231209; //Ŭ���� ���� poly ��Ű�� ������
	
	public boolean onoff;
	String brand;
	public int sn = 10000; //poly ��Ű�� ������
	protected house(){
		onoff = false;
		System.out.println("���� �θ� house Ŭ���� ������~");
	}
	
	protected house(String brand){
		this.brand = brand;
	}
	
	public abstract void power(); // �߰�ȣ�� ������ �����ݷ����� ���� �޼��� = �߻�޼���
	
	// �߻�޼���� �տ� abstract�� ����
	// �߻� �޼��带 ���� Ŭ������ �ݵ�� �߻� Ŭ������ �Ǿ�� �Ѵ�.
	// class �տ� abstract�� ����
	// �θ�Ŭ������ �߻�Ŭ������� �ڽ�Ŭ������ �θ��� ��� �߻�޼��带 �����ؾ��Ѵ�.
	// �θ� ���� �߻�Ŭ������ �ڽ�Ŭ������ �ݵ�� �����Ǿ����
	// �θ𿡰� ���� �߻�޼��带 �ڽ��� �������� ��������� �ڽ�Ŭ������ �߻�Ŭ������ �Ǿ�� �Ѵ�.
	// �߻� Ŭ������ ��ü ������ �ȵȴ�.
	// �߻� �޼���� ������ ���� �޼���� �޸� ������ �Ҵ� ���� ���Ѵ�.
	// �޸� ������ �Ҵ� ���� ���ϱ� ������ �߻�޼��带 ���� Ŭ������ ��ü ���� �Ҵ� ���޴´�.
	
}







