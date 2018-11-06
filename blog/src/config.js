/**
 * Created by HQF on 2018/11/5.
 */
var env = process.env.NODE_ENV
let httpRes = '';
if (env === 'development') {
  httpRes = 'http://127.0.0.1:6010';
} else {
  httpRes = '';
}
export const baseUrl = httpRes;
