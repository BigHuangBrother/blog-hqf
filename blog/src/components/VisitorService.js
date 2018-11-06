import axios from 'axios';
import {baseUrl} from '../config';
import Vue from 'vue';

const test = params => {return axios.get(`${baseUrl}/visit/test`,params).then(res => res.data);}

//中央事件总线
const bus = new Vue();

export const VistorService = {
  test: test
}
