<template>
  <div id="login">
    <form>
      <label for="username">用户名</label><input type="text" v-model.trim="formData.username" name="username" id="userName">
      <label for="age">用户名</label><input type="text" v-model.trim="formData.age" name="age" id="age">
      <input type="button" value="登录" @click="doLogin">
    </form>
  </div>
</template>

<script>
import utils from './utils/utils'

export default {
  name: 'login',
  data () {
    return {
      formData: {
        username: '',
        age: 0
      }
    }
  },
  methods: {
    doLogin () {
      let success = (response) => {
        alert(JSON.stringify(response.data))
      }
      utils.axiosMethod({
        method: 'POST',
        url: '/hello1/',
        data: this.formData,
        callback: success
      })
    }
  }
}
</script>
