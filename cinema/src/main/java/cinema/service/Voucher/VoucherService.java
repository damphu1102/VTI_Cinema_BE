package cinema.service.Voucher;

import cinema.modal.entity.Voucher;
import cinema.modal.request.VoucherRequest;
import org.springframework.data.domain.Page;

import java.util.List;


public interface VoucherService {
    Page<Voucher> findVoucher(int page);
    Voucher findVoucherById(int id);
    Voucher createVoucher(VoucherRequest request);
    Voucher updateVoucher(int id, VoucherRequest request);
    List<Voucher> findVoucherEffective();
}