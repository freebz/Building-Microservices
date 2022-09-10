// 예제 4-1 자바 RMI를 이용한 서비스 엔드포인트 정의

import java.rmi.Remote;
import java.rmi.RemoteException;
public interface CustomerRemote extends Remote {
    public Customer findCustomer(String id) throws RemoteException;

    public Customer createCustomer(String firstname, String surname,
				   String emailAddress) throws RemoteException;
}
