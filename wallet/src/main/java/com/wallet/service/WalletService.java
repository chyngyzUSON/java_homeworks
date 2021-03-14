package com.wallet.service;


import com.wallet.dao.WalletDao;
import com.wallet.model.Wallet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/wallets")
public class WalletService {
    private WalletDao walletDao = new WalletDao();
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Wallet> getAllWallets(){
        return walletDao.getAllWallets();
    }
}
