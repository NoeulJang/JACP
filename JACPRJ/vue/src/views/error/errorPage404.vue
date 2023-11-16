<template>
	<h1>404 Not Found</h1>
	<h5>페이지가 존재하지 않습니다. 고양이가 시무룩해합니다.</h5>
	<img alt="Vue logo" src="../../assets/img/sadcat.jpg">
</template>
 
<script>
export default {
  name: 'PageNotFound',
  methods: {
    prev() {
      this.prevPage()
    },
  },
}
</script>