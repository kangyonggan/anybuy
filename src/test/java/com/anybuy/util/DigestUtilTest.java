package com.anybuy.util;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DigestUtil Tester.
 *
 * @author houbinbin
 * @version 1.0
 * @since 09/17/2016
 */
public class DigestUtilTest {

    protected final static Logger logger = LoggerFactory.getLogger(DigestUtilTest.class);


    /**
     * Method: sha1(byte[] input)
     */
    @Test
    public void sha1InputTest() throws Exception {
    }

    /**
     * Method: sha1(byte[] input, byte[] salt)
     */
    @Test
    public void sha1ForInputSaltTest() throws Exception {
    }

    /**
     * Method: sha1(byte[] input, byte[] salt, int iterations)
     */
    @Test
    public void sha1ForInputSaltIterationsTest() throws Exception {
    }

    /**
     * Method: md5(byte[] input)
     */
    @Test
    public void md5InputTest() throws Exception {
        byte[] input = "hello".getBytes();
        logger.info(input.toString());
    }

    /**
     * Method: md5(byte[] input, byte[] salt)
     */
    @Test
    public void md5ForInputSaltTest() throws Exception {
    }

    /**
     * Method: generateSalt(int numBytes)
     */
    @Test
    public void generateSaltTest() throws Exception {
    }


    /**
     * Method: digest(byte[] input, String algorithm, byte[] salt, int iterations)
     */
    @Test
    public void digestForInputAlgorithmSaltIterationsTest() throws Exception {
        /*
        try {
           Method method = DigestUtil.getClass().getMethod("digest", byte[].class, String.class, byte[].class, int.class);
           method.setAccessible(true);
           method.invoke(<Object>, <Parameters>);
        } catch(NoSuchMethodException e) {
        } catch(IllegalAccessException e) {
        } catch(InvocationTargetException e) {
        }
        */
    }

    /**
     * Method: digest(InputStream input, String algorithm)
     */
    @Test
    public void digestForInputAlgorithmTest() throws Exception {
        /*
        try {
           Method method = DigestUtil.getClass().getMethod("digest", InputStream.class, String.class);
           method.setAccessible(true);
           method.invoke(<Object>, <Parameters>);
        } catch(NoSuchMethodException e) {
        } catch(IllegalAccessException e) {
        } catch(InvocationTargetException e) {
        }
        */
    }

}
