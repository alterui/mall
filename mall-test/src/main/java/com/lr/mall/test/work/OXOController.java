package com.lr.mall.test.work;

import com.lr.mall.test.work.OXOExceptions.*;

class OXOController
{
    OXOModel gameModel;

    public OXOController(OXOModel model)
    {
        gameModel = model;
    }

    public void handleIncomingCommand(String command) throws OXOMoveException
    {
        System.out.println("test is："+command);
    }

}
