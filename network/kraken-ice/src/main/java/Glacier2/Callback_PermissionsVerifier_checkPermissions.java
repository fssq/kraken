// **********************************************************************
//
// Copyright (c) 2003-2010 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.4.1

package Glacier2;

// <auto-generated>
//
// Generated from file `PermissionsVerifier.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


/**
 * Check whether a user has permission to access the router.
 * 
 **/

public abstract class Callback_PermissionsVerifier_checkPermissions extends Ice.TwowayCallback
{
    public abstract void response(boolean __ret, String reason);

    public final void __completed(Ice.AsyncResult __result)
    {
        PermissionsVerifierPrx __proxy = (PermissionsVerifierPrx)__result.getProxy();
        boolean __ret = false;
        Ice.StringHolder reason = new Ice.StringHolder();
        try
        {
            __ret = __proxy.end_checkPermissions(reason, __result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret, reason.value);
    }
}